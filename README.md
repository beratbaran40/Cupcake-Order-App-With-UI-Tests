# Cupcake Ordering App

A simple Jetpack Compose Android application for ordering cupcakes.  
Users can choose quantity, flavor, pickup date, review their order, and share it with others.  
Includes **UI tests** to verify navigation flow, UI elements, and data persistence.

## Features
- Multi-screen navigation with **Navigation Compose**
- Quantity, flavor, and pickup date selection
- Order summary with share option
- **Jetpack Compose** UI
- **ViewModel** + **StateFlow** for state management
- **UI tests** with `compose.ui.test` APIs

## Screenshots

| Start Order | Select Flavor | Select Pickup Date |
|-------------|---------------|--------------------|
| ![Start Order](screenshots/start_order.png) | ![Flavor](screenshots/select_flavor.png) | ![Pickup Date](screenshots/select_pickup.png) |

| Order Summary | Order Done                                | Share Sheet                           |
|---------------|-------------------------------------------|---------------------------------------|
| ![Summary](screenshots/order_summary.png) | ![Order Done](screenshots/done_order.png) | ![Share](screenshots/share_sheet.png) |

## Tech Stack
- **Kotlin**
- **Jetpack Compose**
- **Navigation Compose**
- **Material 3**
- **ViewModel** & **StateFlow**
- **Jetpack Compose UI Testing**