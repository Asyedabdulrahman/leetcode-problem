class Solution {
public:
    using ll = long long;

    ll minEnd(int n, int x){

        ll num = x , one = 1;

        vector<int> unsetBits;
        for(int bit = 0 ; bit < 63 ; bit++){
            if(num >> bit & one ^ one){
                unsetBits.push_back(bit);
            }
        }

        ll mask = n - 1;
        for(int index = 0 ; index < unsetBits.size() ; index++){
            if(mask >> index & one){
                num |= one << unsetBits[index];
            }
        }

        return num;
    }
};