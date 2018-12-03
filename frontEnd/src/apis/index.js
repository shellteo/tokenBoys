import axios from 'axios';

const BASE_URL = 'http://172.20.10.11:8090/';
const apis = {
  setContent: `${BASE_URL}ela/setElaInfo`,
  getDetail: `${BASE_URL}ela/getElaInfo`,
  getList: `${BASE_URL}ela/getElaInfoList`
};

export function setContent(data) {
  return axios({
    method: 'post',
    url: apis.setContent,
    data: data
  }).then((res) => {
    return res.data
  });
}

export function getDetail(data) {
  return axios({
    method: 'get',
    url: apis.getDetail,
    params: data
  }).then((res) => {
    return res.data
  });
}

export function getList(data) {
  return axios({
    method: 'get',
    url: apis.getList,
    data: data
  }).then((res) => {
    return res.data
  });
}
