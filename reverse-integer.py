class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x < 0:
            return self.reverse(-x)
        result = 0
        while x > 0:
            result = result * 10 + x % 10
            x = x // 10
        
        if result > 2**31 - 1:
            return 0
        else:
            return result