import { NavigationContainer, TabRouter } from '@react-navigation/native';
import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import { createBottomTabNavigator } from '@react-navigation/bottom-tabs';
import Home from '../screens/home';
import Login from '../components/auth/Login';
import Settings from '../screens/settings';
const Tab = createBottomTabNavigator();
const AppLayoutPage = () => {
    return (

        <Tab.Navigator>
        <Tab.Screen name="Home" component={Home} />
        <Tab.Screen name="Cài đặt" component={Settings}></Tab.Screen>
        </Tab.Navigator>

  
    );
}

const styles = StyleSheet.create({})

export default AppLayoutPage;
