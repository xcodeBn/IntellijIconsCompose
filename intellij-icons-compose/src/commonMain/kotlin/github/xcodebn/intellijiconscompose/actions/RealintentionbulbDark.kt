package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RealintentionbulbDark: ImageVector
    get() {
        if (_RealintentionbulbDark != null) return _RealintentionbulbDark!!

        _RealintentionbulbDark = ImageVector.Builder(
            name = "RealintentionbulbDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(13f, 8f)
                lineTo(11f, 6f)
                close()
                moveTo(15f, 6f)
                curveTo(15.06f, 6.02f, 15.06f, 5.42f, 14.83f, 5.20f)
                lineTo(14f, 4f)
                curveTo(13.58f, 3.94f, 12.98f, 3.94f, 12.76f, 4.17f)
                lineTo(12f, 5f)
                close()
                moveTo(9f, 6f)
                lineTo(8f, 7f)
                close()
                moveTo(11f, 4f)
                lineTo(10f, 5f)
                close()
                moveTo(7f, 8f)
                lineTo(6f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(13f, 8f)
                    lineTo(11f, 6f)
                    close()
                    moveTo(15f, 6f)
                    curveTo(15.06f, 6.02f, 15.06f, 5.42f, 14.83f, 5.20f)
                    lineTo(14f, 4f)
                    curveTo(13.58f, 3.94f, 12.98f, 3.94f, 12.76f, 4.17f)
                    lineTo(12f, 5f)
                    close()
                    moveTo(9f, 6f)
                    lineTo(8f, 7f)
                    close()
                    moveTo(11f, 4f)
                    lineTo(10f, 5f)
                    close()
                    moveTo(7f, 8f)
                    lineTo(6f, 9f)
                    close()
                }
            }
        }.build()

        return _RealintentionbulbDark!!
    }

private var _RealintentionbulbDark: ImageVector? = null

