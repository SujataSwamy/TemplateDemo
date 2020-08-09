#!/bin/bash

# Firebase service account decrypt
- openssl aes-256-cbc -K $encrypted_a947c7e304d7_key -iv $encrypted_a947c7e304d7_iv
  -in zzcxv-c780e-ec750bd872cb.json.enc -out zzcxv-c780e-ec750bd872cb.json -d
#  Install Google Cloud SDK
wget --quiet --output-document=/tmp/google-cloud-sdk.tar.gz https://dl.google.com/dl/cloudsdk/channels/rapid/google-cloud-sdk.tar.gz  
mkdir -p /opt  
tar zxf /tmp/google-cloud-sdk.tar.gz --directory /opt  
/opt/google-cloud-sdk/install.sh --quiet
source /opt/google-cloud-sdk/path.bash.inc

# Setup and configure the project
gcloud components update
echo zzcxv-c780e
gcloud config set project zzcxv-c780e

# Activate cloud credentials
gcloud auth activate-service-account --key-file zzcxv-c780e-ec750bd872cb.json

# List available options for logging purpose only (so that we can review available options)
gcloud firebase test android models list
gcloud firebase test android versions list

./gradlew build assembleDebug
./gradlew testDevDebugUnitTest
./gradlew :app:assembleDebugAndroidTest

gcloud firebase test android run --app app/build/outputs/apk/deb ug/app-debug.apk --type=robo --device model=Pixel2,version=28
gcloud firebase test android run \
    --type instrumentation \
    --app app/build/outputs/apk/debug/app-debug.apk \
    --test app/build/outputs/apk/androidTest/debug/app-debug-androidTest.apk
#    --device model=Pixel2,version=28,locale=en,orientation=portrait  \
#    --device model=NexusLowRes,version=24,locale=en,orientation=portrait





