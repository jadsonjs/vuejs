

import axios from 'axios';

export const HTTP = axios.create({
  baseURL: 'http://localhost:8180/',
  headers: {
    'Authorization': 'Bearer {token}',
    'Content-Type': 'application/json' 
  }
})

