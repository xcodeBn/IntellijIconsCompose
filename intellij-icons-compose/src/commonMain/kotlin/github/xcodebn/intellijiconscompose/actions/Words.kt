package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Words: ImageVector
    get() {
        if (_Words != null) return _Words!!

        _Words = ImageVector.Builder(
            name = "Words",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(15f, 3f)
                lineTo(12f, 13f)
                horizontalLineTo(10f)
                lineTo(8f, 7f)
                lineTo(6f, 13f)
                horizontalLineTo(4f)
                lineTo(2f, 3f)
                horizontalLineTo(4f)
                lineTo(5f, 10f)
                lineTo(7f, 3f)
                horizontalLineTo(9f)
                lineTo(11f, 10f)
                lineTo(12f, 3f)
                horizontalLineTo(15f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91))
                ) {
                    moveTo(15f, 3f)
                    lineTo(12f, 13f)
                    horizontalLineTo(10f)
                    lineTo(8f, 7f)
                    lineTo(6f, 13f)
                    horizontalLineTo(4f)
                    lineTo(2f, 3f)
                    horizontalLineTo(4f)
                    lineTo(5f, 10f)
                    lineTo(7f, 3f)
                    horizontalLineTo(9f)
                    lineTo(11f, 10f)
                    lineTo(12f, 3f)
                    horizontalLineTo(15f)
                    close()
                }
            }
        }.build()

        return _Words!!
    }

private var _Words: ImageVector? = null

