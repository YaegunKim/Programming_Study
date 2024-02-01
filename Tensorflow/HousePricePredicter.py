import tensorflow as tf
import numpy as np

def house_model():
    from tensorflow import keras
    
    # Define input and output tensors with the values for houses with 1 up to 6 bedrooms
    xs = np.array([1,2,3,4,5,6], dtype=float)
    ys = np.array([1,1.5,2,2.5,3,3.5], dtype=float)
    
    # Define model
    model = tf.keras.Sequential([keras.layers.Dense(units=1, input_shape=[1])])
    
    # Compile model
    # Set the optimizer to Stochastic Gradient Descent
    model.compile(optimizer='sgd', loss='mean_squared_error')
    
    # Train model for 1000 epochs by feeding the i/o tensors
    model.fit(xs, ys, epochs=1000)
    
    return model

model = house_model()

new_x = 7.0
prediction = model.predict([new_x])[0]
print(prediction)