/**
 * @param {string[][]} accounts
 * @return {string[][]}
 */
var accountsMerge = function(accounts) {
    const emailToName = new Map();
    const graph = new Map();

    for (const account of accounts) {
        const name = account[0];
        for (let i = 1; i < account.length; i++) {
            const email = account[i];
            if (!graph.has(email)) graph.set(email, new Set());
            emailToName.set(email, name);
            if (i > 1) {
                graph.get(account[i]).add(account[i - 1]);
                graph.get(account[i - 1]).add(account[i]);
            }
        }
    }

    const visited = new Set();
    const res = [];

    for (const email of graph.keys()) {
        if (!visited.has(email)) {
            const stack = [email], emails = [];
            while (stack.length) {
                const node = stack.pop();
                if (visited.has(node)) continue;
                visited.add(node);
                emails.push(node);
                for (const nei of graph.get(node)) {
                    stack.push(nei);
                }
            }
            emails.sort();
            res.push([emailToName.get(email), ...emails]);
        }
    }

    return res;
};