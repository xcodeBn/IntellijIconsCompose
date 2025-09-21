package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KillprocessDark: ImageVector
    get() {
        if (_KillprocessDark != null) return _KillprocessDark!!

        _KillprocessDark = ImageVector.Builder(
            name = "KillprocessDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 12f)
                lineTo(11f, 14f)
                lineTo(5f, 14f)
                lineTo(5f, 12f)
                lineTo(3f, 12f)
                curveTo(2.65f, 10.52f, 2.30f, 8.80f, 2.30f, 6.43f)
                curveTo(2.30f, 3.43f, 5.00f, 1.00f, 8.00f, 1.00f)
                curveTo(11.00f, 1.00f, 13.70f, 3.43f, 13.70f, 6.43f)
                curveTo(13.70f, 8.80f, 13.36f, 10.51f, 12.68f, 11.59f)
                lineTo(11f, 12f)
                close()
                moveTo(5f, 10f)
                curveTo(5.40f, 9.96f, 6.95f, 9.18f, 6.95f, 8.36f)
                curveTo(6.95f, 7.54f, 6.64f, 7.05f, 5.91f, 6.90f)
                curveTo(3.51f, 6.43f, 3.51f, 7.97f, 3.51f, 8.24f)
                curveTo(3.51f, 9.13f, 3.92f, 9.70f, 4.66f, 9.83f)
                close()
                moveTo(11f, 10f)
                curveTo(11.48f, 9.71f, 11.89f, 9.14f, 11.89f, 8.24f)
                curveTo(11.89f, 7.97f, 11.89f, 6.43f, 9.49f, 6.91f)
                curveTo(8.76f, 7.05f, 8.45f, 7.54f, 8.45f, 8.36f)
                curveTo(8.45f, 9.19f, 10.00f, 9.97f, 10.74f, 9.84f)
                close()
            }
        }.build()

        return _KillprocessDark!!
    }

private var _KillprocessDark: ImageVector? = null

