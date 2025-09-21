package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Splithorizontally: ImageVector
    get() {
        if (_Splithorizontally != null) return _Splithorizontally!!

        _Splithorizontally = ImageVector.Builder(
            name = "Splithorizontally",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 7f)
                lineTo(3f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                lineTo(3f, 7f)
                close()
                moveTo(4f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 2f)
                lineTo(3f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                lineTo(3f, 2f)
                close()
                moveTo(4f, 3f)
                verticalLineTo(7f)
                lineTo(13f, 7f)
                verticalLineTo(3f)
                lineTo(4f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 7f)
                    lineTo(3f, 13f)
                    horizontalLineTo(14f)
                    verticalLineTo(7f)
                    lineTo(3f, 7f)
                    close()
                    moveTo(4f, 8f)
                    verticalLineTo(12f)
                    horizontalLineTo(13f)
                    verticalLineTo(8f)
                    horizontalLineTo(4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 2f)
                    lineTo(3f, 8f)
                    horizontalLineTo(14f)
                    verticalLineTo(2f)
                    lineTo(3f, 2f)
                    close()
                    moveTo(4f, 3f)
                    verticalLineTo(7f)
                    lineTo(13f, 7f)
                    verticalLineTo(3f)
                    lineTo(4f, 3f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 7f)
                    lineTo(3f, 13f)
                    horizontalLineTo(14f)
                    verticalLineTo(7f)
                    lineTo(3f, 7f)
                    close()
                    moveTo(4f, 8f)
                    verticalLineTo(12f)
                    horizontalLineTo(13f)
                    verticalLineTo(8f)
                    horizontalLineTo(4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(3f, 2f)
                    lineTo(3f, 8f)
                    horizontalLineTo(14f)
                    verticalLineTo(2f)
                    lineTo(3f, 2f)
                    close()
                    moveTo(4f, 3f)
                    verticalLineTo(7f)
                    lineTo(13f, 7f)
                    verticalLineTo(3f)
                    lineTo(4f, 3f)
                    close()
                }
            }
        }.build()

        return _Splithorizontally!!
    }

private var _Splithorizontally: ImageVector? = null

