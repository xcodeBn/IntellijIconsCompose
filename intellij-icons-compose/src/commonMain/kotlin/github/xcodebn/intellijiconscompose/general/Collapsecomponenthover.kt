package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Collapsecomponenthover: ImageVector
    get() {
        if (_Collapsecomponenthover != null) return _Collapsecomponenthover!!

        _Collapsecomponenthover = ImageVector.Builder(
            name = "Collapsecomponenthover",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 3f)
                lineTo(13f, 2f)
                lineTo(11f, 5f)
                lineTo(8f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                lineTo(11f, 5f)
                lineTo(14f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 13f)
                lineTo(3f, 14f)
                lineTo(5f, 11f)
                lineTo(8f, 14f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                lineTo(5f, 11f)
                lineTo(2f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 3f)
                    lineTo(13f, 2f)
                    lineTo(11f, 5f)
                    lineTo(8f, 3f)
                    verticalLineTo(8f)
                    horizontalLineTo(14f)
                    lineTo(11f, 5f)
                    lineTo(14f, 3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(2f, 13f)
                    lineTo(3f, 14f)
                    lineTo(5f, 11f)
                    lineTo(8f, 14f)
                    verticalLineTo(9f)
                    horizontalLineTo(2f)
                    lineTo(5f, 11f)
                    lineTo(2f, 13f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(14f, 3f)
                    lineTo(13f, 2f)
                    lineTo(11f, 5f)
                    lineTo(8f, 3f)
                    verticalLineTo(8f)
                    horizontalLineTo(14f)
                    lineTo(11f, 5f)
                    lineTo(14f, 3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(2f, 13f)
                    lineTo(3f, 14f)
                    lineTo(5f, 11f)
                    lineTo(8f, 14f)
                    verticalLineTo(9f)
                    horizontalLineTo(2f)
                    lineTo(5f, 11f)
                    lineTo(2f, 13f)
                    close()
                }
            }
        }.build()

        return _Collapsecomponenthover!!
    }

private var _Collapsecomponenthover: ImageVector? = null

