package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScratchDark: ImageVector
    get() {
        if (_ScratchDark != null) return _ScratchDark!!

        _ScratchDark = ImageVector.Builder(
            name = "ScratchDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8f)
                curveTo(14.21f, 8.00f, 16.00f, 6.21f, 16.00f, 4.00f)
                curveTo(16.00f, 1.79f, 14.21f, 0.00f, 12.00f, 0.00f)
                curveTo(9.79f, 0.00f, 8.00f, 1.79f, 8.00f, 4.00f)
                curveTo(8.00f, 6.21f, 9.79f, 8.00f, 12.00f, 8.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 7f)
                curveTo(14.43f, 7.00f, 16.00f, 5.43f, 16.00f, 3.50f)
                curveTo(16.00f, 1.57f, 14.43f, 0.00f, 12.50f, 0.00f)
                curveTo(10.57f, 0.00f, 9.00f, 1.57f, 9.00f, 3.50f)
                curveTo(9.00f, 5.43f, 10.57f, 7.00f, 12.50f, 7.00f)
                close()
                moveTo(13f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                lineTo(12f, 4f)
                lineTo(13f, 5f)
                lineTo(14f, 5f)
                lineTo(13f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 8f)
                    curveTo(14.21f, 8.00f, 16.00f, 6.21f, 16.00f, 4.00f)
                    curveTo(16.00f, 1.79f, 14.21f, 0.00f, 12.00f, 0.00f)
                    curveTo(9.79f, 0.00f, 8.00f, 1.79f, 8.00f, 4.00f)
                    curveTo(8.00f, 6.21f, 9.79f, 8.00f, 12.00f, 8.00f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF40B6E0)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12f, 7f)
                    curveTo(14.43f, 7.00f, 16.00f, 5.43f, 16.00f, 3.50f)
                    curveTo(16.00f, 1.57f, 14.43f, 0.00f, 12.50f, 0.00f)
                    curveTo(10.57f, 0.00f, 9.00f, 1.57f, 9.00f, 3.50f)
                    curveTo(9.00f, 5.43f, 10.57f, 7.00f, 12.50f, 7.00f)
                    close()
                    moveTo(13f, 4f)
                    verticalLineTo(2f)
                    horizontalLineTo(12f)
                    verticalLineTo(4f)
                    horizontalLineTo(12f)
                    lineTo(12f, 4f)
                    lineTo(13f, 5f)
                    lineTo(14f, 5f)
                    lineTo(13f, 4f)
                    close()
                }
            }
        }.build()

        return _ScratchDark!!
    }

private var _ScratchDark: ImageVector? = null

