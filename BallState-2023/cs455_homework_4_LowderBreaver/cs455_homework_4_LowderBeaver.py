
# Load the dataset from the CSV file
with open("C:/Users/Austen Lowder/Desktop/cs455_homework_4_data_LowderBeavertest.csv", 'r') as f:
    data = [line.strip().split(',') for line in f.readlines()]


# Convert the data to floats and strings
for i in range(len(data)):
    for j in range(len(data[i])):
        if j == 2:
            continue
        data[i][j] = float(data[i][j])

# Normalize the dataset
max_val = [max([row[j] for row in data]) for j in range(2)]
for i in range(len(data)):
    for j in range(2):
        data[i][j] /= max_val[j]

# Add class labels
for i in range(len(data)):
    if i < 50:
        data[i].append('high')
    else:
        data[i].append('low')

# Split the dataset into training and test datasets
import random
random.seed(1)
test_indices = random.sample(range(len(data)), 40)
test_data = [data[i] for i in test_indices]
train_data = [data[i] for i in range(len(data)) if i not in test_indices]

# Implement the KNN algorithm
def knn_classify(test_point, train_data, k):
    distances = []
    for i in range(len(train_data)):
        distance = 0
        for j in range(len(test_point)):
            if j == 2:
                continue
            distance += (train_data[i][j] - test_point[j]) ** 2
        distances.append((distance ** 0.5, train_data[i][-1]))
    distances.sort()
    neighbors = distances[:k]
    class_counts = {}
    for neighbor in neighbors:
        if neighbor[1] in class_counts:
            class_counts[neighbor[1]] += 1
        else:
            class_counts[neighbor[1]] = 1
    sorted_class_counts = sorted(class_counts.items(), key=lambda x: x[1], reverse=True)
    return sorted_class_counts[0][0]

# Evaluate the performance of the KNN algorithm
def evaluate_performance(test_data, train_data, k):
    correct_a = 0
    correct_b = 0
    for i in range(len(test_data)):
        predicted_label = knn_classify(test_data[i][:-1], train_data, k)
        true_label = test_data[i][-1]
        if true_label == 'high':
            if predicted_label == 'high':
                correct_a += 1
        else:
            if predicted_label == 'low':
                correct_b += 1
    accuracy_a = correct_a / 20
    accuracy_b = correct_b / 20
    overall_accuracy = (correct_a + correct_b) / 40
    return accuracy_a, accuracy_b, overall_accuracy

# Receive k=1 from the user
k = 5
predicted_labels = []
for i in range(len(test_data)):
    predicted_label = knn_classify(test_data[i][:-1], train_data, k)
    predicted_labels.append(predicted_label)

# Output the classification accuracy of class A
accuracy_a, accuracy_b, overall_accuracy = evaluate_performance(test_data, train_data, k)
print("Classification accuracy of class high:", accuracy_a)

# Output the classification accuracy of class B
print("Classification accuracy of class low:", accuracy_b)

# Output the overall classification accuracy
print("Overall classification accuracy:", overall_accuracy)
