class Code1:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        sorted_id = sorted(range(len(nums)), key=lambda k: nums[k])
        head = 0
        tail = len(nums) - 1
        sum_result = nums[sorted_id[head]] + nums[sorted_id[tail]]
        while sum_result != target:
            if sum_result > target:
                tail -= 1
            elif sum_result < target:
                head += 1
            sum_result = nums[sorted_id[head]] + nums[sorted_id[tail]]
        t =[]
        t.append(head)
        t.append(tail)
        #return [sorted_id[head], sorted_id[tail]]
        return head

    def test1(self,b):
        print(111)
        print(b)

if __name__ == '__main__':
    nums=[2, 7, 11, 15]
    target=10
    c = Code1();
    c.twoSum(nums=nums,target=target)