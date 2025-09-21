package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WatchDark: ImageVector
    get() {
        if (_WatchDark != null) return _WatchDark!!

        _WatchDark = ImageVector.Builder(
            name = "WatchDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 6f)
                lineTo(1f, 6f)
                curveTo(0.79f, 5.79f, 0.98f, 5.60f, 1.21f, 5.45f)
                curveTo(1.89f, 5.02f, 2.84f, 4.80f, 3.80f, 4.80f)
                curveTo(4.76f, 4.80f, 5.61f, 4.92f, 6.29f, 5.38f)
                curveTo(6.60f, 5.58f, 6.82f, 5.82f, 6.99f, 6.09f)
                curveTo(7.30f, 6.03f, 7.64f, 6.00f, 8.00f, 6.00f)
                curveTo(8.36f, 6.00f, 8.68f, 6.03f, 8.99f, 6.08f)
                curveTo(9.16f, 5.81f, 9.38f, 5.57f, 9.68f, 5.37f)
                curveTo(10.37f, 4.92f, 11.22f, 4.80f, 12.18f, 4.80f)
                curveTo(13.14f, 4.80f, 14.09f, 5.01f, 14.77f, 5.45f)
                curveTo(15.00f, 5.60f, 15.19f, 5.79f, 15.33f, 6.00f)
                lineTo(16f, 6f)
                lineTo(16f, 8f)
                lineTo(16f, 8f)
                curveTo(15.80f, 8.20f, 15.79f, 8.40f, 15.78f, 8.59f)
                curveTo(15.66f, 10.61f, 14.25f, 12.20f, 12.18f, 12.20f)
                curveTo(9.45f, 12.20f, 8.48f, 10.70f, 8.48f, 8.50f)
                curveTo(8.48f, 8.23f, 8.49f, 7.96f, 8.51f, 7.70f)
                curveTo(8.35f, 7.68f, 8.18f, 7.67f, 8.00f, 7.67f)
                curveTo(7.82f, 7.67f, 7.64f, 7.68f, 7.47f, 7.71f)
                curveTo(7.49f, 7.97f, 7.50f, 8.23f, 7.50f, 8.50f)
                curveTo(7.50f, 10.70f, 6.53f, 12.20f, 3.80f, 12.20f)
                curveTo(1.73f, 12.20f, 0.32f, 10.62f, 0.20f, 8.60f)
                curveTo(0.19f, 8.40f, 0.18f, 8.20f, 0.18f, 8.00f)
                close()
                moveTo(12f, 11f)
                curveTo(13.39f, 10.67f, 14.22f, 9.73f, 14.29f, 8.54f)
                curveTo(14.33f, 7.79f, 14.28f, 7.06f, 13.69f, 6.68f)
                curveTo(13.29f, 6.43f, 12.73f, 6.30f, 12.16f, 6.30f)
                curveTo(11.60f, 6.30f, 11.09f, 6.37f, 10.69f, 6.64f)
                curveTo(10.07f, 7.05f, 9.98f, 7.76f, 9.98f, 8.48f)
                curveTo(9.98f, 9.78f, 10.56f, 10.67f, 12.16f, 10.67f)
                close()
                moveTo(4f, 11f)
                curveTo(5.42f, 10.67f, 6.00f, 9.78f, 6.00f, 8.48f)
                curveTo(6.00f, 7.76f, 5.91f, 7.05f, 5.29f, 6.64f)
                curveTo(4.89f, 6.37f, 4.38f, 6.30f, 3.82f, 6.30f)
                curveTo(3.25f, 6.30f, 2.69f, 6.43f, 2.29f, 6.68f)
                curveTo(1.70f, 7.06f, 1.65f, 7.79f, 1.69f, 8.54f)
                curveTo(1.76f, 9.73f, 2.59f, 10.67f, 3.82f, 10.67f)
                close()
            }
        }.build()

        return _WatchDark!!
    }

private var _WatchDark: ImageVector? = null

