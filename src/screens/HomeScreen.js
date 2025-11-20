import React from 'react';
import {StyleSheet, Text, View, useColorScheme} from 'react-native';

const HomeScreen = () => {
  const isDarkMode = useColorScheme() === 'dark';

  return (
    <View style={[styles.container, isDarkMode && styles.containerDark]}>
      <Text style={[styles.title, isDarkMode && styles.titleDark]}>
        Welcome to Mobileapp
      </Text>
      <Text style={[styles.subtitle, isDarkMode && styles.subtitleDark]}>
        Your React Native mobile application is ready!
      </Text>
      <View style={styles.infoContainer}>
        <Text style={[styles.infoText, isDarkMode && styles.infoTextDark]}>
          Edit src/screens/HomeScreen.js to get started
        </Text>
      </View>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 20,
    backgroundColor: '#f5f5f5',
  },
  containerDark: {
    backgroundColor: '#1a1a1a',
  },
  title: {
    fontSize: 28,
    fontWeight: 'bold',
    marginBottom: 10,
    color: '#333',
    textAlign: 'center',
  },
  titleDark: {
    color: '#fff',
  },
  subtitle: {
    fontSize: 18,
    marginBottom: 20,
    color: '#666',
    textAlign: 'center',
  },
  subtitleDark: {
    color: '#ccc',
  },
  infoContainer: {
    marginTop: 30,
    padding: 15,
    backgroundColor: '#e8e8e8',
    borderRadius: 8,
  },
  infoText: {
    fontSize: 14,
    color: '#555',
  },
  infoTextDark: {
    color: '#aaa',
  },
});

export default HomeScreen;
