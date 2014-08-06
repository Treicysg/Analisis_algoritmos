################################################################################
# Tecnológico de Costa Rica
# Análisis de Algoritmos
# Tarea Corta 1
# Estudiante : Treicy Sánchez Gutiérrez
################################################################################

import random
import time

#Selection Sort

def selection_sort(L):
 
    for curPos in range( len(L) ):
        # Encuentra la posición con el número más pequeño
        
        minPos = curPos
 
        for scanPos in range(curPos+1, len(L) ):
 
            
            if L[scanPos] < L[minPos]:
 
               
                minPos = scanPos
 
        # intercambia los 2 valores 
        temp = L[minPos]
        L[minPos] = L[curPos]
        L[curPos] = temp


#Bubble Sort
        
def bubblesort( A ):
  for i in range( len( A ) ):
    for k in range( len( A ) - 1, i, -1 ):
      if ( A[k] < A[k - 1] ):
        swap( A, k, k - 1 )
        
 
def swap( A, x, y ):
  tmp = A[x]
  A[x] = A[y]
  A[y] = tmp


#Funciones para las medidas de Tiempos

def tiempoDesordenadas(L):
    """La función calcula el tiempo que toma el bubble sort
    y selection sort en ordenar una lista que se encuentra desordenada"""

  
    listaPruebaS = L
    listaPruebaB = L
   
    
    print("Comportamiento con Listas desordenadas")
    
    inicio = time.time()
    bubblesort(listaPruebaB)
    fin =  time.time()
    total = fin- inicio
    print("Tiempo de Bubble Sort : ", total)
   
   
    inicioS = time.time()
    selection_sort(listaPruebaS)
    finS =  time.time()
    totalS = finS - inicioS
    print("Tiempo de Selection Sort : ", totalS)

    
    

def tiempoOrdenadas(L):

    """La función calcula el tiempo que toma el bubble sort
    y selection sort en ordenar una lista que ya se encuentra ordenada"""

    
    sorted(L)
   
    
    print("\n")
    print("Comportamiento con listas ordenadas")
    
    start = time.time()
    bubblesort(L)
    end =  time.time()
    tiempo = end - start
    print("Tiempo de Bubble Sort : ", tiempo)

   
    startS = time.time()
    selection_sort(L)
    endS =  time.time()
    tiempoS = endS- startS
    print("Tiempo de Selection Sort : ", tiempoS)

def tiempoReverso(L):
    """La función calcula el tiempo que toma el bubble sort
    y selection sort en ordenar una lista que se encuentra revertida"""

    print("\n")
    print("Comportamiento con listas en orden descendente")

    L.sort()
    L.reverse()
   

    s = time.time()
    bubblesort(L)
    e =  time.time()
    t = e - s
    print("Tiempo de Bubble Sort : ", t)

    L.reverse()
   
    
    ss = time.time()
    selection_sort(L)
    es =  time.time()
    tS = es- ss
    print("Tiempo de Selection Sort : ", tS)

    
    

    

#################################Main#############################################  
def main():

    listaPrueba = []
    
    largoLista = random.randint(1,20)

    for indice in range(largoLista) :
        numero = random.randint(1,100000) 
        listaPrueba.append(numero)

    print(listaPrueba)   
    pruebaOrdenada = listaPrueba
    pruebaDesordenada = listaPrueba
    pruebaReversa = listaPrueba
    
    
    tiempoDesordenadas(pruebaDesordenada)
    tiempoOrdenadas(pruebaOrdenada)
    tiempoReverso(pruebaReversa)




    

main()
    
    

      
