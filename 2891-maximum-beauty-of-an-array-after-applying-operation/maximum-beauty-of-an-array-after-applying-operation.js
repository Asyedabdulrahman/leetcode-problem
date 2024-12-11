/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var maximumBeauty = function (a, k) {
  const n = a.length
  a.sort((a, b) => a - b)

  let an = 1

  let L = 0
  for (let R = 1; R < n; ++R) {
    if (L < R && a[L] + k < a[R] - k) {
      L++ // do not meet or overlap - move L towards R
    } else {
      an = Math.max(an, R - L + 1)
    }
  }

  return an
}