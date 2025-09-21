package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProjectdirectoryDark: ImageVector
    get() {
        if (_ProjectdirectoryDark != null) return _ProjectdirectoryDark!!

        _ProjectdirectoryDark = ImageVector.Builder(
            name = "ProjectdirectoryDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(14f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 13f)
                lineTo(2f, 13f)
                lineTo(2f, 5f)
                lineTo(2f, 3f)
                lineTo(7f, 3f)
                lineTo(8f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(10f, 15f)
                lineTo(10f, 10f)
                lineTo(15f, 10f)
                lineTo(15f, 15f)
                lineTo(10f, 15f)
                close()
                moveTo(11f, 14f)
                lineTo(13f, 14f)
                lineTo(13f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 14f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(14f, 9f)
                    lineTo(9f, 9f)
                    lineTo(9f, 13f)
                    lineTo(2f, 13f)
                    lineTo(2f, 5f)
                    lineTo(2f, 3f)
                    lineTo(7f, 3f)
                    lineTo(8f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(10f, 15f)
                    lineTo(10f, 10f)
                    lineTo(15f, 10f)
                    lineTo(15f, 15f)
                    lineTo(10f, 15f)
                    close()
                    moveTo(11f, 14f)
                    lineTo(13f, 14f)
                    lineTo(13f, 13f)
                    lineTo(11f, 13f)
                    lineTo(11f, 14f)
                    close()
                }
            }
        }.build()

        return _ProjectdirectoryDark!!
    }

private var _ProjectdirectoryDark: ImageVector? = null

