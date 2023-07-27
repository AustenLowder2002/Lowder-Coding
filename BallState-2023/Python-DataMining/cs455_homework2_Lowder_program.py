price = [9999,117990,34990,15990,26800,23990]
priceMin = 7000
priceMax = 169990

year =[2010,2021,2021,2010,2016,2017]
yearMin = 2003
yearMax = 2022

kilometer =  [263000,19,24,120579,72506,120579]
kilometerMin = 19
kilometerMax = 323317

def normalize_data(data, min, max):
    new_data = []
    for i in range(len(data)):
        new_value = (data[i] - min)/ (max - min )
        new_data.append(new_value)
    return new_data

price = normalize_data(price, priceMin, priceMax)
year = normalize_data(year, yearMin, yearMax)
kilometer = normalize_data(kilometer, kilometerMin, kilometerMax)
import math

def compute_distance_matrix(data):
        distance_matrix = []
        for i in range(len(data)):
            temp = []
            for j in range(len(data)):
                difference = round(math.fabs(data[i] - data[j]), 2)
                temp.append(difference)
            distance_matrix.append(temp)
        return distance_matrix
    
price_difference = compute_distance_matrix(price)
kilometer_difference = compute_distance_matrix(kilometer)


cars = ['Toyota','Mercedes','Mercedes','Mercedes','Holden','Nissan']


def compute_distance_nominal(data):
    distance_matrix = []
    for i in range(len(data)):
        temp = []
        for j in range(len(data)):
            if (data[i] != data[j]):
                difference = 1
            else:
                difference = 0
            temp.append(difference)
        distance_matrix.append(temp)
    return distance_matrix

cars_differnece = compute_distance_nominal(cars)


status = ['2003', '2004', '2005', '2006','2007','2008','2009','2010','2011','2012','2013','2014','2015','2016','2017','2018','2019','2020','2021','2022']
def compute_distance_ordinal(data):
    distance_matrix = []
    rank_order = ['2010','2010', '2016', '2017','2021', '2021']
    for i in range(len(data)):
        temp = []
        for j in range(len(data)):
            rank_i = 0
            rank_j = 0
            for k in range(len(rank_order)):
                if (data[i] == rank_order[k]):
                    rank_i = k+1
                if (data[j] == rank_order[k]):
                    rank_j = k+1
                difference = round((math.fabs(rank_i-rank_j))/(len(rank_order) - 1), 2)
            temp.append(difference)
        distance_matrix.append(temp)
    return distance_matrix

status_difference = compute_distance_ordinal(status)

def compute_distance_numerical(data):
    distance_matrix = []
    for i in range(len(data)):
        temp = []
        for j in range(len(data)):
            difference = round(math.fabs(data[i] - data[j]), 2)
            temp.append(difference)
        distance_matrix.append(temp)
    return distance_matrix

def compute_distance_final(distance_num, distance_num2, distance_cat, distance_or):
    distance_matrix = []
    for i in range(len(distance_num)):
        temp = []
        for j in range(len(distance_num)):
            sum = round((distance_num[i][j] + distance_cat[i][j] + distance_or[i][j])*(1/3),2)
            temp.append(sum)
        distance_matrix.append(temp)
    return distance_matrix

distance_final = compute_distance_final(price_difference, kilometer_difference, cars_differnece, status_difference)
print(distance_final)

desired_i = int(input("Input the first object index (0-5)"))

desired_j = int(input("Input the second object index (0-5)"))


distance = distance_final[desired_i][desired_j]

print(distance)



