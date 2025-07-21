# 1. 빌드용 이미지 (Node 환경)
FROM node:18-alpine AS builder

WORKDIR /app

# package.json, package-lock.json 복사 후 의존성 설치
COPY package*.json ./
RUN npm install

# 나머지 코드 복사
COPY . .

# 빌드 및 정적 export (out 폴더 생성)
RUN npm run build && npm run export

# 2. 서비스용 이미지 (Nginx 웹서버)
FROM nginx:alpine

# 빌드 결과물 복사
COPY --from=builder /app/out /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]