import axios from "axios";
import store from "@/store";

const service = axios.create({
  baseURL: process.env.VUE_APP_API_BASE_URL,
  // 跨域请求携带 Cookie
  withCredentials: false,
  // Request Timeout
  timeout: 5000
});

// 请求拦截器
service.interceptors.request.use(
  config => {
    if (store.getters.token) {
      config.headers["Authentication"] = "Bearer it-is-a-secret-token";
    }
    return config;
  },
  error => {
    console.log("[request:error]", error);
    return Promise.reject(error);
  }
);

// 响应拦截器
service.interceptors.response.use(
  response => {
    return response.data;
  },
  error => {
    console.log("[response:error]", error);
    return Promise.reject(error);
  }
);

export default service;
