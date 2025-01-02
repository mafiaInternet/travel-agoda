import React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";
import AppLayoutPage from "./layouts/AppLayoutPage";
import Home from "./screens/home";
import Login from "./components/auth/Login";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import Settings from "./screens/settings";
import "./global.css";
import { Text } from "react-native";

// Các màn hình của bạn
const Tab = createBottomTabNavigator();
// Khởi tạo Stack Navigator
const Stack = createStackNavigator();

export default function App() {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="AppLayout" component={AppLayoutPage} />
        <Stack.Screen name="Login" component={Login}  options={{ headerShown: false }}></Stack.Screen>
  
      </Stack.Navigator>
    </NavigationContainer>
  );
}
