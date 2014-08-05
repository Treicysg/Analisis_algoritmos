
import random
import time

#The selection Sort
def selection_sort(L):
 
    # Loop through the entire array
    for curPos in range( len(L) ):
        # Find the position that has the smallest number
        # Start with the current position
        minPos = curPos
 
        # Scan left to right (end of the list)
        for scanPos in range(curPos+1, len(L) ):
 
            # Is this position smallest?
            if L[scanPos] < L[minPos]:
 
                # It is, mark this position as the smallest
                minPos = scanPos
 
        # Swap the two values
        temp = L[minPos]
        L[minPos] = L[curPos]
        L[curPos] = temp


#**********BubleSort**********#
def bubblesort( A ):
  for i in range( len( A ) ):
    for k in range( len( A ) - 1, i, -1 ):
      if ( A[k] < A[k - 1] ):
        swap( A, k, k - 1 )
        
 
def swap( A, x, y ):
  tmp = A[x]
  A[x] = A[y]
  A[y] = tmp

  
def main():

    listaPrueba = []
    
    largoLista = random.randint(1,500)

    for indice in range(largoLista) :
        numero = random.randint(1,100000) 
        listaPrueba.append(numero)        
   

    listaPruebaS = listaPrueba
    listaPruebaB = listaPrueba

    inicio = time.time()
    bubblesort(listaPruebaB)
    fin =  time.time()
    total = fin- inicio
    print("Tiempo de Bubble Sort : ", total)
    
    
    

    inicioS = time.time()
    selection_sort(listaPruebaS)
    finS =  time.time()
    totalS = finS- inicioS
    print("Tiempo de Selection Sort : ", totalS)
  

    

main()
    
    

      
