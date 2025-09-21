package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowinspection: ImageVector
    get() {
        if (_Toolwindowinspection != null) return _Toolwindowinspection!!

        _Toolwindowinspection = ImageVector.Builder(
            name = "Toolwindowinspection",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 10f)
                curveTo(3.76f, 9.81f, 3.36f, 9.25f, 3.15f, 8.60f)
                lineTo(3f, 9f)
                curveTo(2.62f, 8.60f, 2.40f, 8.38f, 2.40f, 8.10f)
                lineTo(2f, 8f)
                curveTo(2.40f, 7.22f, 2.62f, 7.00f, 2.90f, 7.00f)
                lineTo(3f, 7f)
                curveTo(3.02f, 6.84f, 3.04f, 6.68f, 3.07f, 6.52f)
                curveTo(3.04f, 6.38f, 3.02f, 6.21f, 3.01f, 6.00f)
                lineTo(2f, 6f)
                lineTo(2f, 5f)
                lineTo(3f, 5f)
                lineTo(3f, 3f)
                curveTo(3.00f, 2.59f, 3.09f, 2.28f, 3.25f, 1.97f)
                curveTo(3.42f, 1.66f, 3.66f, 1.42f, 3.97f, 1.25f)
                curveTo(4.28f, 1.09f, 4.59f, 1.00f, 5.44f, 1.00f)
                lineTo(8f, 1f)
                curveTo(8.41f, 1.00f, 8.72f, 1.09f, 9.03f, 1.25f)
                curveTo(9.34f, 1.42f, 9.58f, 1.66f, 9.75f, 1.97f)
                curveTo(9.91f, 2.28f, 10.00f, 2.59f, 10.00f, 3.44f)
                lineTo(10f, 5f)
                lineTo(12f, 5f)
                lineTo(12f, 6f)
                lineTo(10f, 6f)
                curveTo(9.98f, 6.21f, 9.96f, 6.38f, 9.93f, 6.52f)
                curveTo(9.96f, 6.68f, 9.98f, 6.84f, 9.99f, 7.00f)
                lineTo(10f, 7f)
                curveTo(10.38f, 7.00f, 10.60f, 7.22f, 10.60f, 7.50f)
                lineTo(11f, 8f)
                curveTo(10.60f, 8.38f, 10.38f, 8.60f, 10.10f, 8.60f)
                lineTo(10f, 9f)
                curveTo(9.64f, 9.25f, 9.24f, 9.81f, 8.71f, 10.22f)
                curveTo(10.57f, 10.64f, 11.00f, 11.58f, 11.00f, 12.00f)
                lineTo(2f, 12f)
                curveTo(2.00f, 11.58f, 2.43f, 10.64f, 4.29f, 10.22f)
                close()
            }
        }.build()

        return _Toolwindowinspection!!
    }

private var _Toolwindowinspection: ImageVector? = null

