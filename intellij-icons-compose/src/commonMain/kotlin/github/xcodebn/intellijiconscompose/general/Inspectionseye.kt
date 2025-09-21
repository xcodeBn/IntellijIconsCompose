package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionseye: ImageVector
    get() {
        if (_Inspectionseye != null) return _Inspectionseye!!

        _Inspectionseye = ImageVector.Builder(
            name = "Inspectionseye",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4f)
                curveTo(5.27f, 4.00f, 2.94f, 5.78f, 2.00f, 8.29f)
                curveTo(2.94f, 10.79f, 5.27f, 12.57f, 8.00f, 12.57f)
                curveTo(10.73f, 12.57f, 13.06f, 10.79f, 14.00f, 8.29f)
                curveTo(13.06f, 5.78f, 10.73f, 4.00f, 8.00f, 4.00f)
                close()
                moveTo(8f, 11f)
                curveTo(6.34f, 11.29f, 5.00f, 9.94f, 5.00f, 8.29f)
                curveTo(5.00f, 6.63f, 6.34f, 5.29f, 8.00f, 5.29f)
                curveTo(9.66f, 5.29f, 11.00f, 6.63f, 11.00f, 8.29f)
                curveTo(11.00f, 9.94f, 9.66f, 11.29f, 8.00f, 11.29f)
                close()
                moveTo(8f, 7f)
                curveTo(7.05f, 6.57f, 6.29f, 7.34f, 6.29f, 8.29f)
                curveTo(6.29f, 9.23f, 7.05f, 10.00f, 8.00f, 10.00f)
                curveTo(8.95f, 10.00f, 9.71f, 9.23f, 9.71f, 8.29f)
                curveTo(9.71f, 7.34f, 8.95f, 6.57f, 8.00f, 6.57f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 4f)
                    curveTo(5.27f, 4.00f, 2.94f, 5.78f, 2.00f, 8.29f)
                    curveTo(2.94f, 10.79f, 5.27f, 12.57f, 8.00f, 12.57f)
                    curveTo(10.73f, 12.57f, 13.06f, 10.79f, 14.00f, 8.29f)
                    curveTo(13.06f, 5.78f, 10.73f, 4.00f, 8.00f, 4.00f)
                    close()
                    moveTo(8f, 11f)
                    curveTo(6.34f, 11.29f, 5.00f, 9.94f, 5.00f, 8.29f)
                    curveTo(5.00f, 6.63f, 6.34f, 5.29f, 8.00f, 5.29f)
                    curveTo(9.66f, 5.29f, 11.00f, 6.63f, 11.00f, 8.29f)
                    curveTo(11.00f, 9.94f, 9.66f, 11.29f, 8.00f, 11.29f)
                    close()
                    moveTo(8f, 7f)
                    curveTo(7.05f, 6.57f, 6.29f, 7.34f, 6.29f, 8.29f)
                    curveTo(6.29f, 9.23f, 7.05f, 10.00f, 8.00f, 10.00f)
                    curveTo(8.95f, 10.00f, 9.71f, 9.23f, 9.71f, 8.29f)
                    curveTo(9.71f, 7.34f, 8.95f, 6.57f, 8.00f, 6.57f)
                    close()
                }
            }
        }.build()

        return _Inspectionseye!!
    }

private var _Inspectionseye: ImageVector? = null

