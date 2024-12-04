/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
const subarraysDivByK = ( n, k ) => {
    let c = 0, s = k*3e8, m = [1,...Array(k-1).fill(0)]
    for ( let i = 0; i < n.length; i++ )
        c += m[ ( s += n[i] ) % k ]++
    return c
}