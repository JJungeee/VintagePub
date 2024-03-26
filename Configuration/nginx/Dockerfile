FROM nginx:1.25.2
  
ENV TZ=Asia/Seoul

COPY nginx.conf /etc/nginx/nginx.conf

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
