# Stage 1: Build the app
FROM node:18-alpine AS builder

WORKDIR /app

COPY package.json ./
RUN npm install

COPY . .
RUN npm run build

# Stage 2: Run the app
FROM node:18-alpine

WORKDIR /app

COPY --from=builder /app ./

ENV NODE_ENV=production
RUN npm install --omit=dev

EXPOSE 3000

CMD ["npm", "start"]

