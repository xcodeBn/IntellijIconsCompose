package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Splitvertically: ImageVector
    get() {
        if (_Splitvertically != null) return _Splitvertically!!

        _Splitvertically = ImageVector.Builder(
            name = "Splitvertically",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 2f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                close()
                moveTo(8f, 3f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                close()
                moveTo(13f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 2f)
                    horizontalLineTo(3f)
                    verticalLineTo(13f)
                    horizontalLineTo(9f)
                    verticalLineTo(2f)
                    close()
                    moveTo(8f, 3f)
                    horizontalLineTo(4f)
                    verticalLineTo(12f)
                    horizontalLineTo(8f)
                    verticalLineTo(3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 2f)
                    horizontalLineTo(8f)
                    verticalLineTo(13f)
                    horizontalLineTo(14f)
                    verticalLineTo(2f)
                    close()
                    moveTo(13f, 3f)
                    horizontalLineTo(9f)
                    verticalLineTo(12f)
                    horizontalLineTo(13f)
                    verticalLineTo(3f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(9f, 2f)
                    horizontalLineTo(3f)
                    verticalLineTo(13f)
                    horizontalLineTo(9f)
                    verticalLineTo(2f)
                    close()
                    moveTo(8f, 3f)
                    horizontalLineTo(4f)
                    verticalLineTo(12f)
                    horizontalLineTo(8f)
                    verticalLineTo(3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 2f)
                    horizontalLineTo(8f)
                    verticalLineTo(13f)
                    horizontalLineTo(14f)
                    verticalLineTo(2f)
                    close()
                    moveTo(13f, 3f)
                    horizontalLineTo(9f)
                    verticalLineTo(12f)
                    horizontalLineTo(13f)
                    verticalLineTo(3f)
                    close()
                }
            }
        }.build()

        return _Splitvertically!!
    }

private var _Splitvertically: ImageVector? = null

