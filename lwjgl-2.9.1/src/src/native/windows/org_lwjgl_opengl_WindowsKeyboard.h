/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_lwjgl_opengl_WindowsKeyboard */

#ifndef _Included_org_lwjgl_opengl_WindowsKeyboard
#define _Included_org_lwjgl_opengl_WindowsKeyboard
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    isWindowsNT
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_isWindowsNT
  (JNIEnv *, jclass);

/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    MapVirtualKey
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_MapVirtualKey
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    ToUnicode
 * Signature: (IILjava/nio/ByteBuffer;Ljava/nio/CharBuffer;II)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_ToUnicode
  (JNIEnv *, jclass, jint, jint, jobject, jobject, jint, jint);

/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    ToAscii
 * Signature: (IILjava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_ToAscii
  (JNIEnv *, jclass, jint, jint, jobject, jobject, jint);

/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    GetKeyboardState
 * Signature: (Ljava/nio/ByteBuffer;)I
 */
JNIEXPORT jint JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_GetKeyboardState
  (JNIEnv *, jclass, jobject);

/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    GetKeyState
 * Signature: (I)S
 */
JNIEXPORT jshort JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_GetKeyState
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_lwjgl_opengl_WindowsKeyboard
 * Method:    GetAsyncKeyState
 * Signature: (I)S
 */
JNIEXPORT jshort JNICALL Java_org_lwjgl_opengl_WindowsKeyboard_GetAsyncKeyState
  (JNIEnv *, jclass, jint);

#ifdef __cplusplus
}
#endif
#endif
