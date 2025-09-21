package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Expandcomponent: ImageVector
    get() {
        if (_Expandcomponent != null) return _Expandcomponent!!

        _Expandcomponent = ImageVector.Builder(
            name = "Expandcomponent",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 9f)
                lineTo(7f, 9f)
                lineTo(4f, 11f)
                lineTo(2f, 9f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                lineTo(5f, 12f)
                lineTo(7f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 5f)
                lineTo(14f, 7f)
                verticalLineTo(2f)
                horizontalLineTo(9f)
                lineTo(11f, 4f)
                lineTo(9f, 7f)
                lineTo(9f, 7f)
                lineTo(12f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 9f)
                    lineTo(7f, 9f)
                    lineTo(4f, 11f)
                    lineTo(2f, 9f)
                    verticalLineTo(14f)
                    horizontalLineTo(7f)
                    lineTo(5f, 12f)
                    lineTo(7f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12f, 5f)
                    lineTo(14f, 7f)
                    verticalLineTo(2f)
                    horizontalLineTo(9f)
                    lineTo(11f, 4f)
                    lineTo(9f, 7f)
                    lineTo(9f, 7f)
                    lineTo(12f, 5f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 9f)
                    lineTo(7f, 9f)
                    lineTo(4f, 11f)
                    lineTo(2f, 9f)
                    verticalLineTo(14f)
                    horizontalLineTo(7f)
                    lineTo(5f, 12f)
                    lineTo(7f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(12f, 5f)
                    lineTo(14f, 7f)
                    verticalLineTo(2f)
                    horizontalLineTo(9f)
                    lineTo(11f, 4f)
                    lineTo(9f, 7f)
                    lineTo(9f, 7f)
                    lineTo(12f, 5f)
                    close()
                }
            }
        }.build()

        return _Expandcomponent!!
    }

private var _Expandcomponent: ImageVector? = null

