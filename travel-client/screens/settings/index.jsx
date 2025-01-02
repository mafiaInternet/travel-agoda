
import React from "react";
import { Button, StyleSheet, Text, TouchableOpacity, View } from "react-native";

const Settings = ({ navigation }) => {
  return (
    <View className="flex justify-center items-center h-screen">
    <Text className="border-b border-solid">Tài khoản của tôi</Text>
      <Text className="text-red-300 bg-black">Settings</Text>
      <View>
        <Text>Đăng nhập/ Đăng ký</Text>
        <Text>Danh sách yêu thích</Text>
      </View>
      <Button title="Đi đến Đăng nhập" onPress={() => navigation.navigate("Login")} />
    </View>
  );
};

const styles = StyleSheet.create({});

export default Settings;
