import request from '@/utils/request'

export function getToken() {
  return request({
    url: '/rest/qiniu/token',
    method: 'get'
  })
}
