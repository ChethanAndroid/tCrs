
# react-native-bbpos-vf-crs

## Getting started

`$ npm install react-native-bbpos-vf-crs --save`

### Mostly automatic installation

`$ react-native link react-native-bbpos-vf-crs`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-bbpos-vf-crs` and add `RNBbposVfCrs.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNBbposVfCrs.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.verifone.bbpos.RNBbposVfCrsPackage;` to the imports at the top of the file
  - Add `new RNBbposVfCrsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-bbpos-vf-crs'
  	project(':react-native-bbpos-vf-crs').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-bbpos-vf-crs/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-bbpos-vf-crs')
  	```


## Usage
```javascript
import RNBbposVfCrs from 'react-native-bbpos-vf-crs';

// TODO: What to do with the module?
RNBbposVfCrs;
```
  