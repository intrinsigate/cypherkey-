# CYPHERKEY GitHub Actions Build Instructions

This package contains the CYPHERKEY Android app project configured with GitHub Actions for automated building. Follow these instructions to set up your GitHub repository and generate the Android App Bundle (.aab) file.

## What's Included in This Package

- Complete Android project structure for CYPHERKEY
- `cypherkey_release.jks` keystore file for app signing
- Build configuration with signing information
- GitHub Actions workflow file for automated builds

## Step 1: Create a New GitHub Repository

1. Go to [GitHub.com](https://github.com) and sign in to your account
2. Click the "+" icon in the top right corner and select "New repository"
3. Name your repository (e.g., "cypherkey-app")
4. Choose "Private" if you want to keep your code private (recommended)
5. Click "Create repository"

## Step 2: Upload the Project Files

### Option A: Using GitHub Web Interface

1. On your new repository page, click "uploading an existing file"
2. Drag and drop all the files and folders from this package
3. Commit the changes with a message like "Initial commit with CYPHERKEY project"

### Option B: Using Git Command Line (if you're familiar with Git)

1. Extract this package to a folder on your computer
2. Open a terminal/command prompt in that folder
3. Run the following commands:
   ```
   git init
   git add .
   git commit -m "Initial commit with CYPHERKEY project"
   git branch -M main
   git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY_NAME.git
   git push -u origin main
   ```

## Step 3: Wait for GitHub Actions to Build the App

1. In your GitHub repository, click on the "Actions" tab
2. You should see a workflow named "Android Build" running
3. Wait for the workflow to complete (this may take a few minutes)
4. Once completed, you'll see a green checkmark if successful

## Step 4: Download the Android App Bundle

1. Click on the completed workflow run
2. Scroll down to the "Artifacts" section
3. Click on "app-bundle" to download the .zip file
4. Extract the .zip file to get your `app-release.aab` file

## Step 5: Upload to Google Play Console

1. Go to your Google Play Console
2. Navigate to your CYPHERKEY app
3. Go to "Release" > "Production" (or your preferred track)
4. Click "Create new release"
5. Upload the `app-release.aab` file
6. Complete the release information and submit for review

## Troubleshooting

If the GitHub Actions build fails:
1. Click on the failed workflow run
2. Examine the logs to identify the issue
3. Make necessary changes to the code
4. Commit and push again to trigger a new build

## Important Notes

- Keep your `cypherkey_release.jks` keystore file and passwords secure
- The keystore password and key password are set to `placeholder_keystore_password` and `placeholder_key_password` respectively
- You may want to use GitHub Secrets to store these passwords more securely in the future

For any questions or issues, please refer to the GitHub Actions documentation or Android developer documentation.
