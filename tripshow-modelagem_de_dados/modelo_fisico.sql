USE [TripShow_RyanCabral_BD]
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 06/02/2022 13:55:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cliente](
	[id_cliente] [int] IDENTITY(1,1) NOT NULL,
	[nome_cliente] [varchar](40) NOT NULL,
	[email_cliente] [varchar](40) NOT NULL,
	[data_nascimento] [varchar](20) NOT NULL,
	[estado_cliente] [varchar](40) NOT NULL,
	[cidade_cliente] [varchar](40) NOT NULL,
	[data_ida] [varchar](20) NOT NULL,
	[data_volta] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Destino]    Script Date: 06/02/2022 13:55:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Destino](
	[id_destino] [int] IDENTITY(1,1) NOT NULL,
	[cidade_destino] [varchar](40) NOT NULL,
	[estado_destino] [varchar](40) NOT NULL,
	[preco_destino] [decimal](7, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id_destino] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Passagem]    Script Date: 06/02/2022 13:55:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Passagem](
	[id_passagem] [int] IDENTITY(1,1) NOT NULL,
	[data_compra] [varchar](40) NOT NULL,
	[FK_id_cliente] [int] NULL,
	[FK_id_destino] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_passagem] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Passagem]  WITH CHECK ADD FOREIGN KEY([FK_id_cliente])
REFERENCES [dbo].[Cliente] ([id_cliente])
GO
ALTER TABLE [dbo].[Passagem]  WITH CHECK ADD FOREIGN KEY([FK_id_destino])
REFERENCES [dbo].[Destino] ([id_destino])
GO
