package com.mfgustavo.nearby.data.model.mock

import com.mfgustavo.nearby.data.model.Market

val mockMarkets = listOf(
    Market(
        id = "0023402-23-23412342-234",
        categoryId = "5678-ghi-8976543",
        name = "Padaria Delícia",
        description = "Padaria artesanal com pães quentinhos, bolos caseiros e cafés especiais. Um espaço aconchegante para todos.",
        coupons = 5,
        rules = emptyList(),
        latitude = -22.98765432123456,
        longitude = -47.12345678912345,
        address = "Rua das Flores, 987 - Jardim das Rosas",
        phone = "(12) 93456-7890",
        cover = "https://images.unsplash.com/photo-2"
    ),
    Market(
        id = "0034503-34-34523453-345",
        categoryId = "9101-jkl-1245789",
        name = "CinePrime",
        description = "Cinema de última geração com salas confortáveis e som imersivo. Experimente o verdadeiro cinema.",
        coupons = 2,
        rules = emptyList(),
        latitude = -23.56891234567891,
        longitude = -46.65878912345678,
        address = "Shopping Center - Piso 3, Loja 45",
        phone = "(11) 91234-5678",
        cover = "https://images.unsplash.com/photo-3"
    ),
    Market(
        id = "0045604-45-45634564-456",
        categoryId = "3210-mno-5432167",
        name = "Academia FitLife",
        description = "Academia moderna com equipamentos de alta tecnologia e aulas personalizadas para todas as idades.",
        coupons = 3,
        rules = emptyList(),
        latitude = -23.45678912345678,
        longitude = -46.65432198765432,
        address = "Av. Saúde, 4321 - Centro",
        phone = "(11) 92345-6789",
        cover = "https://images.unsplash.com/photo-4"
    ),
    Market(
        id = "0056705-56-56745675-567",
        categoryId = "4321-pqr-7654321",
        name = "Spa Natural",
        description = "Spa com tratamentos exclusivos e terapias relaxantes. Ideal para recarregar as energias.",
        coupons = 1,
        rules = emptyList(),
        latitude = -22.87654321098765,
        longitude = -47.98765432101234,
        address = "Estrada do Bem-Estar, 123 - Campo Verde",
        phone = "(13) 94567-8901",
        cover = "https://images.unsplash.com/photo-5"
    )
)