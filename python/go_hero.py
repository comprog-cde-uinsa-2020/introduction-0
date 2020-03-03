import hero


if __name__ == "__main__":

   listName = ["Saras 008", "Mr Black", "Panji Manusia Milenium", "Gatot Kaca"]
   listPower = [100.0, 120.100, 130, 1000]

   listHero = []

   for i in range(len(listPower)):
       listHero.append(hero.Hero(listName[i], listPower[i]))

   print("Show all {}".format(listHero))

   for j in range(len(listHero)):
       print(" name: {} ".format(listHero[j].show_name()))
       print(" power: {} ".format(listHero[j].show_power()))



   

