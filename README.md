# Mobileapp

A React Native mobile application template.

## Prerequisites

Before you begin, ensure you have the following installed:
- [Node.js](https://nodejs.org/) (v16 or higher)
- [npm](https://www.npmjs.com/) or [Yarn](https://yarnpkg.com/)
- [React Native CLI](https://reactnative.dev/docs/environment-setup)
- For iOS: [Xcode](https://developer.apple.com/xcode/) (macOS only)
- For Android: [Android Studio](https://developer.android.com/studio)

## Getting Started

### Installation

1. Clone the repository:
```bash
git clone https://github.com/obaidullahofficial/Mobileapp.git
cd Mobileapp
```

2. Install dependencies:
```bash
npm install
# or
yarn install
```

### Running the Application

#### For iOS (macOS only):
```bash
npm run ios
# or
yarn ios
```

#### For Android:
```bash
npm run android
# or
yarn android
```

#### Start Metro Bundler (if not started automatically):
```bash
npm start
# or
yarn start
```

## Project Structure

```
Mobileapp/
├── src/
│   ├── components/     # Reusable UI components
│   │   └── Button.js
│   └── screens/        # Application screens
│       └── HomeScreen.js
├── App.js              # Main application component
├── index.js            # Application entry point
├── package.json        # Project dependencies and scripts
├── app.json            # App configuration
├── babel.config.js     # Babel configuration
└── metro.config.js     # Metro bundler configuration
```

## Available Scripts

- `npm start` - Start the Metro bundler
- `npm run android` - Run the app on Android
- `npm run ios` - Run the app on iOS
- `npm run lint` - Run ESLint
- `npm test` - Run tests

## Features

- React Native 0.72
- Basic project structure with screens and components
- Dark mode support
- Cross-platform (iOS & Android)

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is open source and available under the MIT License.
