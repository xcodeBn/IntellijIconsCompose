package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InspectionstrafficoffDark: ImageVector
    get() {
        if (_InspectionstrafficoffDark != null) return _InspectionstrafficoffDark!!

        _InspectionstrafficoffDark = ImageVector.Builder(
            name = "InspectionstrafficoffDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 5f)
                curveTo(2.12f, 5.00f, 1.00f, 6.12f, 1.00f, 7.50f)
                verticalLineTo(8f)
                curveTo(1.00f, 9.88f, 2.12f, 11.00f, 3.50f, 11.00f)
                curveTo(4.88f, 11.00f, 6.00f, 9.88f, 6.00f, 8.50f)
                verticalLineTo(8f)
                curveTo(6.00f, 6.12f, 4.88f, 5.00f, 3.50f, 5.00f)
                close()
                moveTo(4f, 6f)
                curveTo(2.67f, 6.00f, 2.00f, 6.67f, 2.00f, 7.50f)
                verticalLineTo(8f)
                curveTo(2.00f, 9.33f, 2.67f, 10.00f, 3.50f, 10.00f)
                curveTo(4.33f, 10.00f, 5.00f, 9.33f, 5.00f, 8.50f)
                verticalLineTo(8f)
                curveTo(5.00f, 6.67f, 4.33f, 6.00f, 3.50f, 6.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(4f, 5f)
                    curveTo(2.12f, 5.00f, 1.00f, 6.12f, 1.00f, 7.50f)
                    verticalLineTo(8f)
                    curveTo(1.00f, 9.88f, 2.12f, 11.00f, 3.50f, 11.00f)
                    curveTo(4.88f, 11.00f, 6.00f, 9.88f, 6.00f, 8.50f)
                    verticalLineTo(8f)
                    curveTo(6.00f, 6.12f, 4.88f, 5.00f, 3.50f, 5.00f)
                    close()
                    moveTo(4f, 6f)
                    curveTo(2.67f, 6.00f, 2.00f, 6.67f, 2.00f, 7.50f)
                    verticalLineTo(8f)
                    curveTo(2.00f, 9.33f, 2.67f, 10.00f, 3.50f, 10.00f)
                    curveTo(4.33f, 10.00f, 5.00f, 9.33f, 5.00f, 8.50f)
                    verticalLineTo(8f)
                    curveTo(5.00f, 6.67f, 4.33f, 6.00f, 3.50f, 6.00f)
                    close()
                }
            }
        }.build()

        return _InspectionstrafficoffDark!!
    }

private var _InspectionstrafficoffDark: ImageVector? = null

