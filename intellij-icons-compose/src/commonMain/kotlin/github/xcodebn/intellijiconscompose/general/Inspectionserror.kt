package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionserror: ImageVector
    get() {
        if (_Inspectionserror != null) return _Inspectionserror!!

        _Inspectionserror = ImageVector.Builder(
            name = "Inspectionserror",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 13f)
                curveTo(10.76f, 13.00f, 13.00f, 10.76f, 13.00f, 8.00f)
                curveTo(13.00f, 5.24f, 10.76f, 3.00f, 8.00f, 3.00f)
                curveTo(5.24f, 3.00f, 3.00f, 5.24f, 3.00f, 8.00f)
                curveTo(3.00f, 10.76f, 5.24f, 13.00f, 8.00f, 13.00f)
                close()
                moveTo(9f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                close()
                moveTo(9f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(8f, 13f)
                    curveTo(10.76f, 13.00f, 13.00f, 10.76f, 13.00f, 8.00f)
                    curveTo(13.00f, 5.24f, 10.76f, 3.00f, 8.00f, 3.00f)
                    curveTo(5.24f, 3.00f, 3.00f, 5.24f, 3.00f, 8.00f)
                    curveTo(3.00f, 10.76f, 5.24f, 13.00f, 8.00f, 13.00f)
                    close()
                    moveTo(9f, 5f)
                    verticalLineTo(8f)
                    horizontalLineTo(7f)
                    verticalLineTo(5f)
                    horizontalLineTo(9f)
                    close()
                    moveTo(9f, 12f)
                    verticalLineTo(10f)
                    horizontalLineTo(7f)
                    verticalLineTo(12f)
                    horizontalLineTo(9f)
                    close()
                }
            }
        }.build()

        return _Inspectionserror!!
    }

private var _Inspectionserror: ImageVector? = null

