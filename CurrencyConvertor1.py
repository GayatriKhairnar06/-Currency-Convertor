# currency name CO=colombian pesos, pe=peruvian soles,br = Brazilian reais
#1usd=0.19 Brazilian reais,iusd=0.00026 colombian pesos,1usd = 0.27 peruvian soles
CO = int(input("What do you left in pesos?  "))
PE = int(input("What do you left in soles?  "))
BR = int(input("What do you left in reais?  "))
usd1=(CO*0.00026)
usd2=(PE*0.27)
usd3=(BR*0.19)
USD=(usd1+usd2+usd3)
print(USD)