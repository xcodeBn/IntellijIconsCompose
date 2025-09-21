package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ExternalLinkArrow: ImageVector
    get() {
        if (_ExternalLinkArrow != null) return _ExternalLinkArrow!!

        _ExternalLinkArrow = ImageVector.Builder(
            name = "ExternalLinkArrow",
            defaultWidth = 14.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 5f)
                horizontalLineTo(5f)
                lineTo(7f, 7f)
                lineTo(4f, 10f)
                lineTo(5f, 11f)
                lineTo(8f, 8f)
                lineTo(10f, 10f)
                verticalLineTo(5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(10f, 5f)
                    horizontalLineTo(5f)
                    lineTo(7f, 7f)
                    lineTo(4f, 10f)
                    lineTo(5f, 11f)
                    lineTo(8f, 8f)
                    lineTo(10f, 10f)
                    verticalLineTo(5f)
                    close()
                }
            }
        }.build()

        return _ExternalLinkArrow!!
    }

private var _ExternalLinkArrow: ImageVector? = null

