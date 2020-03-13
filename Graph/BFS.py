from collections import defaultdict
class Graph:
    def __init__(self):
        self.graph = defaultdict(list)
    def addEdge(self,u,v):
        self.graph[u].append(v)
    def BFS(self,s):
        visited = [False]*(len(self.graph))
        queue =[]
        queue.append(s)
        visited[s] = True
        while queue:
            s = queue.pop(0)
            print(s, end=" ")
            for i in self.graph[s]:
                if visited[i] == False:
                    queue.append(i)
                    visited[i]=True

g = Graph()
g.addEdge(0,1)
g.addEdge(0,2)
g.addEdge(1,2)
g.addEdge(2,0)
g.addEdge(2,3)
g.addEdge(3,3)
print("BFS: ")
g.BFS(2)


'''
>>> s = [('yellow', 1), ('blue', 2), ('yellow', 3), ('blue', 4), ('red', 1)]
>>> d = defaultdict(list)
>>> for k, v in s:
	print("k: " + str(k))
	print("v: " + str(v))
	d[k].append(v)
	print(d)

	
k: yellow
v: 1
defaultdict(<class 'list'>, {'yellow': [1]})
k: blue
v: 2
defaultdict(<class 'list'>, {'yellow': [1], 'blue': [2]})
k: yellow
v: 3
defaultdict(<class 'list'>, {'yellow': [1, 3], 'blue': [2]})
k: blue
v: 4
defaultdict(<class 'list'>, {'yellow': [1, 3], 'blue': [2, 4]})
k: red
v: 1
defaultdict(<class 'list'>, {'yellow': [1, 3], 'blue': [2, 4], 'red': [1]})
>>> 
'''
