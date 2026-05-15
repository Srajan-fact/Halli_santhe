# Halli Santhe

Halli Santhe is an Android marketplace app that connects local vendors and customers in a hyper-local digital market.

## Problem It Solves

Local sellers often struggle to get online visibility, while nearby customers find it difficult to discover trusted local products quickly.  
This project addresses that gap by providing:

- Direct digital product listing for local vendors
- Product discovery with category and search support for customers
- Role-based experience for sellers and buyers
- Trust signals through ratings and reviews
- Fast contact flow through WhatsApp integration

## Technical Overview

- **Platform:** Android
- **Language:** Kotlin
- **UI:** Jetpack Compose + Material 3
- **Architecture style:** State-driven Compose app with centralized in-memory store
- **Persistence:** Android DataStore (language preference)
- **Backend dependencies included:** Firebase Auth, Firestore, Firebase Storage
- **Image loading:** Coil
- **Build system:** Gradle (Kotlin DSL)

## Core Functional Modules

1. **Authentication flow**
   - Role selection (Vendor / Customer)
   - Phone number + OTP verification flow
2. **Vendor module**
   - Upload product listing
   - Manage own products
   - Review visibility from customers
3. **Customer module**
   - Browse product feed
   - Search and filter by categories
   - View product detail, origin, freshness, rating
   - Contact seller via WhatsApp intent
   - Submit ratings/reviews
4. **Localization module**
   - English and Kannada UI support
   - Runtime language toggle
   - Persistent language preference using DataStore

## Data Model Snapshot

The app models these primary entities:

- `MarketplaceUser` (role, profile and contact)
- `Product` (pricing, category, freshness, origin, seller info, status)
- `Review` (customer rating and feedback)
- `OtpSession` (temporary verification session state)

## Repository Structure

- `app/src/main/java/com/example/myapplication/` → app source code
- `app/src/main/res/` → resources, drawables, strings, themes
- `app/build.gradle.kts` → app module build configuration
- `gradle/libs.versions.toml` → dependency and plugin version catalog

## Getting Started

### Prerequisites

- Android Studio (latest stable recommended)
- JDK 11+
- Android SDK configured

### Build & Run

```bash
./gradlew assembleDebug
```

To run tests:

```bash
./gradlew test
```

To run lint checks:

```bash
./gradlew lint
```

## Current Scope

This repository currently demonstrates a functional end-to-end marketplace flow with local/demo state management and multilingual UI support, designed for rapid iteration and feature expansion.
