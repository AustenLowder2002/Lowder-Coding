import pandas as pd
import matplotlib.pyplot as plot
import math
Y = [81.34321894969966, 0.0, 0.001546560758185946, 37.29067300137953, 22.421109935724935, 37.689994989143145, 47.67026087386869, 36.27829432907101, 53.24251928561266, 57.8324023037569, 71.72577621884453, 19.823815798427457, 26.13099988246138, 17.83617591200688, 27.002641525774983, 42.500726883556354, 49.188364914104014, 38.380070399445714, 92.16914425700128, 0.0006186243032743784, 0.001546560758185946, 23.81115874518246, 38.34882987213036, 33.530674486077864, 15.696045134829168, 9.942839114377447, 35.52573786413773, 87.27891913961732, 37.023736614516636, 118.61966359210388, 69.02331594999042, 73.39420596477552, 36.406968184152085, 41.63125042530421, 14.232998657585261, 21.249435505323262, 59.62455691034278, 56.40399878749637, 16.358901075787664, 33.49046390636502, 30.252893615178568, 59.91809414224647, 21.361715816367564, 65.1364994525175, 22.03756286769482, 26.470006000655744, 28.70509560838607, 32.263731912971934, 15.751412009972224, 60.793756843531355, 20.253450377051514, 36.28912025437832, 0.27064813268254057, 54.30438790218312, 0.30590971796918015, 69.94166372820123, 39.6300008042116, 26.427939548033088, 77.46568181677586, 70.20365112063793, 1.1218751739880855, 0.613056684544909, 90.34420256234186, 51.60285556978391, 50.466752036820516, 45.441357509171105, 63.983693063365685, 13.925542378857896, 20.45419396346405, 35.94021614733157, 5.04333463244437, 3.193957277805616, 30.27238028073171, 10.081410958310908, 3.705868888765164, 34.951345198547465, 22.11922127572704, 62.085135076616616, 35.31818941038918, 24.697956683926282, 52.240038602156524, 22.780839968078986, 14.64160000989799, 34.259104603183445, 13.226187604006212, 0.6127473723932718, 16.226515474886945, 81.51086613588701, 13.2892872829402, 100.0, 34.419328297731504, 0.44324431329609215, 10.931091438858267, 55.21098181863172, 18.974444630031737, 24.041286986000532, 42.063668813293, 28.450841019740302, 1.0402167659558674]
X = [1.8399901834468373, 68.09620222099515, 44.78188845941469, 17.172832689122032, 5.5156758083318, 12.14798453892877, 10.42395238971716, 7.35627952635131, 5.208908521995214, 5.208908521995214, 5.208908521995214, 3.368304803975704, 3.9879747223756055, 20.173016749493833, 2.147371004356095, 12.571323394073255, 12.571323394073255, 11.651021535063501, 1.2270691453463403, 44.78188845941469, 41.10068102337567, 0.0, 9.19688324437082, 13.491625253083011, 14.718694398429353, 15.945763543775692, 11.03748696239033, 19.620835634087978, 11.03748696239033, 7.35627952635131, 18.39990183446837, 8.583348671697651, 41.71421559604884, 19.004233388551445, 26.381373090373643, 15.332228971102522, 3.675072090312289, 6.74274495367814, 22.013620467513345, 46.00895760476103, 17.172832689122032, 10.42395238971716, 22.018528744094727, 14.10515982575618, 18.89686483833364, 32.51119700595129, 19.632492790968772, 7.3618013375053675, 69.32020369347813, 7.969814099024481, 17.700472421620958, 14.718694398429353, 36.74335848825081, 26.375851279219585, 100.0, 15.644518068593166, 8.583348671697651, 44.78188845941469, 12.8836124915639, 12.8836124915639, 47.23602675010737, 33.13025338977852, 25.76783851770047, 8.583348671697651, 15.950671820357076, 16.55929811644886, 3.675072090312289, 9.80428247131726, 75.4033989815326, 32.51119700595129, 15.332228971102522, 36.12491563899626, 13.491625253083011, 19.62697097981471, 47.85569666850727, 10.969998159396283, 4.907663046812688, 5.5156758083318, 19.62697097981471, 23.916191177372845, 7.975335910178538, 23.240689612859686, 19.004233388551445, 12.87809068040984, 21.467574697834223, 21.40499417142156, 32.51119700595129, 2.448002944965949, 47.173446223694704, 4.907663046812688, 19.62697097981471, 35.27210258298055, 15.332228971102522, 12.258420762009939, 23.916191177372845, 12.87809068040984, 18.086999202405053, 3.675072090312289, 35.278237928707284]
points = list(zip(X, Y))
def get_X(P):
    r = []
    for x in P:
        r.append(x[0])
    return r
def get_Y(P):
    r = []
    for x in P:
        r.append(x[1])
    return r
def SSE(center, cluster):
    sum = 0
    for p in cluster:
        d = distance(center, p)
        sum = sum + d * d
    return sum
plot.ylim([0, 105])
plot.xlim([0, 105])
X = get_X(points)
Y = get_Y(points)
plot.scatter(X, Y)
centroid_1 = points[30]
centroid_2 = points[35]
centroid_3 = points[45]
X = get_X(points)
Y = get_Y(points)
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y)
X = get_X([centroid_1])
Y = get_Y([centroid_1])
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y, color="green", marker="^")
X = get_X([centroid_2])
Y = get_Y([centroid_2])
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y, color="red", marker="^")
X = get_X([centroid_3])
Y = get_Y([centroid_3])
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y, color="blue", marker="^")
def distance(p, q):
    return int(math.fabs(p[0] - q[0]) + math.fabs(p[1] - q[1]))
cluster_1 = []
cluster_2 = []
cluster_3 = []
for i in range(len(points)):
    if distance(points[i], centroid_1) < distance(points[i], centroid_2):
        cluster_1.append(i)
    elif distance(points[i], centroid_2) < distance(points[i], centroid_3):
        cluster_3.append(i)
    else:
        cluster_2.append(i)
print(cluster_1)
print(cluster_2)
cluster_points = []
for x in cluster_1:
    cluster_points.append(points[x])
X = get_X(cluster_points)
Y = get_Y(cluster_points)
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y, color="green")
cluster_points = []
for x in cluster_2:
    cluster_points.append(points[x])
X = get_X(cluster_points)
Y = get_Y(cluster_points)
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y, color="red")
cluster_points = []
for x in cluster_3:
    cluster_points.append(points[x])
X = get_X(cluster_points)
Y = get_Y(cluster_points)
plot.ylim([0, 105])
plot.xlim([0, 105])
plot.scatter(X, Y, color="blue")
cluster_points = []
for x in cluster_1:
    cluster_points.append(points[x])
print(SSE(centroid_1, cluster_points))
cluster_points = []
for x in cluster_2:
    cluster_points.append(points[x])
print(SSE(centroid_2, cluster_points))
for x in cluster_3:
    cluster_points.append(points[x])
print(SSE(centroid_3, cluster_points))
def new_centroid(p):
    sum_of_x = 0
    sum_of_y = 0
    for i in range(len(p)):
        sum_of_x = points[p[i]][0] + sum_of_x
    for i in range(len(p)):
        sum_of_y = points[p[i]][1] + sum_of_y
    return int(sum_of_x / len(p)), int(sum_of_y / len(p))
old_centroid_1 = centroid_1
old_centroid_2 = centroid_2
old_centroid_3 = centroid_3
centroid_1 = new_centroid(cluster_1)
centroid_2 = new_centroid(cluster_2)
centroid_3 = new_centroid(cluster_3)
print(old_centroid_1 == centroid_1)
print(old_centroid_2 == centroid_2)
print(old_centroid_3 == centroid_3)
cluster_1 = []
cluster_2 = []
cluster_3 = []
for i in range(len(points)):
    if distance(points[i], centroid_1) < distance(points[i], centroid_2):
        cluster_1.append(i)
    elif distance(points[i], centroid_2) < distance(points[i], centroid_3):
        cluster_3.append(i)
    else:
        cluster_2.append(i)

old_centroid_1 = centroid_1
old_centroid_2 = centroid_2
old_centroid_3 = centroid_3
centroid_1 = new_centroid(cluster_1)
centroid_2 = new_centroid(cluster_2)
centroid_3 = new_centroid(cluster_3)

print(old_centroid_1 == centroid_1)
print(old_centroid_2 == centroid_2)
print(old_centroid_3 == centroid_3)
old_centroid_1 = centroid_1
old_centroid_2 = centroid_2
old_centroid_3 = centroid_3
centroid_1 = new_centroid(cluster_1)
centroid_2 = new_centroid(cluster_2)
centroid_3 = new_centroid(cluster_3)
print(old_centroid_1 == centroid_1)
print(old_centroid_2 == centroid_2)
print(old_centroid_3 == centroid_3)
cluster_points = []
for x in cluster_1:
    cluster_points.append(points[x])
X = get_X(cluster_points)
Y = get_Y(cluster_points)
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="green")
cluster_points = []

for x in cluster_2:
    cluster_points.append(points[x])
X = get_X(cluster_points)
Y = get_Y(cluster_points)
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="blue")
X = get_X([centroid_1])
Y = get_Y([centroid_1])
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="blue", marker="^")
X = get_X([centroid_2])
Y = get_Y([centroid_2])
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="blue", marker="^")
X = get_X([centroid_3])
Y = get_Y([centroid_3])
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="yellow", marker="^")
cluster_points = []

for x in cluster_3:
    cluster_points.append(points[x])
X = get_X(cluster_points)
Y = get_Y(cluster_points)
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="red")
X = get_X([centroid_1])
Y = get_Y([centroid_1])
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="yellow", marker="^")
X = get_X([centroid_2])
Y = get_Y([centroid_2])
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="yellow", marker="^")
X = get_X([centroid_3])
Y = get_Y([centroid_3])
plot.ylim([0,105])
plot.xlim([0,105])
plot.scatter(X, Y, color="yellow", marker="^")
cluster_points = []

for x in cluster_1:
    cluster_points.append(points[x])
SSE(centroid_1, cluster_points)
cluster_points = []
for x in cluster_2:
    cluster_points.append(points[x])
SSE(centroid_2, cluster_points)
for x in cluster_3:
    cluster_points.append(points[x])
SSE(centroid_3, cluster_points)