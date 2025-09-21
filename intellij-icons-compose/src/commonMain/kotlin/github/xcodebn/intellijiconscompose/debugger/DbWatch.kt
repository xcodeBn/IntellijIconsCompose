package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbWatch: ImageVector
    get() {
        if (_DbWatch != null) return _DbWatch!!

        _DbWatch = ImageVector.Builder(
            name = "DbWatch",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 2f)
                lineTo(1f, 2f)
                curveTo(0.79f, 1.79f, 0.98f, 1.60f, 1.21f, 1.45f)
                curveTo(1.89f, 1.02f, 2.84f, 0.80f, 3.80f, 0.80f)
                curveTo(4.76f, 0.80f, 5.61f, 0.92f, 6.29f, 1.38f)
                curveTo(6.60f, 1.58f, 6.82f, 1.82f, 6.99f, 2.09f)
                curveTo(7.30f, 2.03f, 7.64f, 2.00f, 8.00f, 2.00f)
                curveTo(8.36f, 2.00f, 8.68f, 2.03f, 8.99f, 2.08f)
                curveTo(9.16f, 1.81f, 9.38f, 1.57f, 9.68f, 1.37f)
                curveTo(10.37f, 0.92f, 11.22f, 0.80f, 12.18f, 0.80f)
                curveTo(13.14f, 0.80f, 14.09f, 1.01f, 14.77f, 1.45f)
                curveTo(15.00f, 1.60f, 15.19f, 1.79f, 15.33f, 2.00f)
                lineTo(16f, 2f)
                lineTo(16f, 4f)
                lineTo(16f, 4f)
                curveTo(15.80f, 4.20f, 15.79f, 4.40f, 15.78f, 4.59f)
                curveTo(15.66f, 6.61f, 14.25f, 8.20f, 12.18f, 8.20f)
                curveTo(9.45f, 8.20f, 8.48f, 6.70f, 8.48f, 4.50f)
                curveTo(8.48f, 4.23f, 8.49f, 3.96f, 8.51f, 3.70f)
                curveTo(8.35f, 3.68f, 8.18f, 3.67f, 8.00f, 3.67f)
                curveTo(7.82f, 3.67f, 7.64f, 3.68f, 7.47f, 3.71f)
                curveTo(7.49f, 3.97f, 7.50f, 4.23f, 7.50f, 4.50f)
                curveTo(7.50f, 6.70f, 6.53f, 8.20f, 3.80f, 8.20f)
                curveTo(1.73f, 8.20f, 0.32f, 6.62f, 0.20f, 4.60f)
                curveTo(0.19f, 4.40f, 0.18f, 4.20f, 0.18f, 4.00f)
                close()
                moveTo(12f, 7f)
                curveTo(13.39f, 6.67f, 14.22f, 5.73f, 14.29f, 4.54f)
                curveTo(14.33f, 3.79f, 14.28f, 3.06f, 13.69f, 2.68f)
                curveTo(13.29f, 2.43f, 12.73f, 2.30f, 12.16f, 2.30f)
                curveTo(11.60f, 2.30f, 11.09f, 2.37f, 10.69f, 2.64f)
                curveTo(10.07f, 3.05f, 9.98f, 3.76f, 9.98f, 4.48f)
                curveTo(9.98f, 5.78f, 10.56f, 6.67f, 12.16f, 6.67f)
                close()
                moveTo(4f, 7f)
                curveTo(5.42f, 6.67f, 6.00f, 5.78f, 6.00f, 4.48f)
                curveTo(6.00f, 3.76f, 5.91f, 3.05f, 5.29f, 2.64f)
                curveTo(4.89f, 2.37f, 4.38f, 2.30f, 3.82f, 2.30f)
                curveTo(3.25f, 2.30f, 2.69f, 2.43f, 2.29f, 2.68f)
                curveTo(1.70f, 3.06f, 1.65f, 3.79f, 1.69f, 4.54f)
                curveTo(1.76f, 5.73f, 2.59f, 6.67f, 3.82f, 6.67f)
                close()
            }
        }.build()

        return _DbWatch!!
    }

private var _DbWatch: ImageVector? = null

