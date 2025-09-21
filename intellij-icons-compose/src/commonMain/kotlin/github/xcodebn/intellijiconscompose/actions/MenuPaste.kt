package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MenuPaste: ImageVector
    get() {
        if (_MenuPaste != null) return _MenuPaste!!

        _MenuPaste = ImageVector.Builder(
            name = "MenuPaste",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 2f)
                verticalLineTo(1f)
                horizontalLineTo(10f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                close()
                moveTo(7f, 2f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                close()
                moveTo(5f, 5f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(6f, 2f)
                    verticalLineTo(1f)
                    horizontalLineTo(10f)
                    verticalLineTo(2f)
                    horizontalLineTo(13f)
                    verticalLineTo(14f)
                    horizontalLineTo(3f)
                    verticalLineTo(2f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(7f, 2f)
                    verticalLineTo(3f)
                    horizontalLineTo(9f)
                    verticalLineTo(2f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(5f, 5f)
                    verticalLineTo(12f)
                    horizontalLineTo(11f)
                    verticalLineTo(5f)
                    horizontalLineTo(5f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(6f, 2f)
                    verticalLineTo(1f)
                    horizontalLineTo(10f)
                    verticalLineTo(2f)
                    horizontalLineTo(13f)
                    verticalLineTo(14f)
                    horizontalLineTo(3f)
                    verticalLineTo(2f)
                    horizontalLineTo(6f)
                    close()
                    moveTo(7f, 2f)
                    verticalLineTo(3f)
                    horizontalLineTo(9f)
                    verticalLineTo(2f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(5f, 5f)
                    verticalLineTo(12f)
                    horizontalLineTo(11f)
                    verticalLineTo(5f)
                    horizontalLineTo(5f)
                    close()
                }
            }
        }.build()

        return _MenuPaste!!
    }

private var _MenuPaste: ImageVector? = null

