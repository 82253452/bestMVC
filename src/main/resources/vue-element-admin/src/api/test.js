import request from '@/utils/request'

export function fetchList(query) {
  return request({
    url: '/sport/getSprots',
    method: 'get',
    params: query,
    changeOrigin: true
  })
}

export function edit(query) {
  return request({
    url: '/article/list',
    method: 'get',
    params: query
  })
}

export function getUserBySportId(query) {
  return request({
    url: '/sport/getUserBySportId',
    method: 'get',
    params: query
  })
}

export function getMatchBySportId(query) {
  return request({
    url: '/sport/getMatchBySportId',
    method: 'get',
    params: query
  })
}

export function getMatchById(query) {
  return request({
    url: '/sport/getMatchById',
    method: 'get',
    params: query
  })
}

export function updateMatchResult(data) {
  return request({
    url: '/sport/updateMatchResult',
    method: 'post',
    data
  })
}

export function updateEliMatchResult(data) {
  return request({
    url: '/sport/updateEliMatchResult',
    method: 'post',
    data
  })
}

export function test(query) {
  return request({
    url: '/sport/test',
    method: 'get',
    params: query
  })
}




