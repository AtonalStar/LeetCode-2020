class Solution(object):
    def hIndex(self, citations):
        """
        :type citations: List[int]
        :rtype: int
        """
        citations.sort(reverse=True)
        h=0
        
        if len(citations)==0:
            return 0
        elif citations[0]==0:
            return 0
        else:
            for n in citations:
                h+=1
                if n<h:
                    h-=1         
        return h
